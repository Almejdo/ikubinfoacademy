package RestaurantOOPUsht;

public class Restaurant {

        private final Order[] orders;
        private final Customer[] customers;
        private final int customerIndex = 0;
        private String emri;
        private int nrPunonjesish;
        private int orderIndex = 0;

        public Restaurant(String emri, int nrPunonjesish) {
            this.emri = emri;
            this.nrPunonjesish = nrPunonjesish;
            customers = new Customer[5];
            orders = new Order[15];
        }

        public void vendosPorosi(Dish[] dishes, Customer customer) {

            if (orderIndex >= 15) {
                System.out.println("Nuk kemi mundesi ta procesojme kerkesen tuaj");

            } else {
                for (int i = 0; i < this.customers.length; i++) {

                    if (customer.getId().equals(this.customers[i].getId())) {
                        Order order = new Order(this.customers[i]);

                        for (int j = 0; j < dishes.length; j++) {
                            order.addDish(dishes[j]);
                        }

                        this.orders[this.orderIndex++] = order;

                        System.out.println("U shtua porosia");
                        break;
                    }
                }
            }
        }

        public Order[] merrPorositeECustomer(Customer customer) {
            Order[] ordera = new Order[15];
            int j = 0;
            for (int i = 0; i < this.orders.length; i++) {
                if (orders[i].getCustomer().getId().equals(customer.getId())) {
                    ordera[j] = orders[i];
                    j++;

                }

            }
            return ordera;
        }

        public Dish[] merrOrderatECustomer(Customer customer) {
            Dish[] dishes = new Dish[45];
            Order[] order = merrPorositeECustomer(customer);
            int j = 0;

            for (int i = 0; i < order.length; i++) {
                Dish[] dishesOfOrder = order[i].getDish();
                for (int k = 0; k < dishesOfOrder.length; k++) {
                    dishes[j] = dishesOfOrder[k];
                    j++;
                }
            }
            return dishes;

        }

        public Customer shfaqCustomersTePorosise(Order order) {
            return order.getCustomer();
        }

        public Customer[] shfaqCustomersTeDish(Dish dish) {
            // Kerko tek orders per kete dish
            // Nqs e gjejme kete dish tek nje order
            // vendosim customerin tek array customersToReturn

            Customer[] customersToReturn = new Customer[5];
            int j = 0;

            for (int i = 0; i < orders.length; i++) {
                Dish[] dish1 = orders[i].getDish();
                for (int k = 0; k < dish1.length; k++) {
                    if (dish1[k].getEmer().equals(dish.getEmer())) {

                        boolean klientiEkziston = false; // nuk ekziston

                        for ( int z = 0 ; z < customersToReturn.length ; z++) {
                            if (customersToReturn[z].getId().equals(orders[i].getCustomer().getId())){
                                klientiEkziston = true; // klienti ekziston , e kemi shtuar nje here
                            }
                        }

                        if (!klientiEkziston){
                            customersToReturn[j++] = orders[i].getCustomer();
                        }
                    }

                }
            }




            return customersToReturn;

        }

        public Order gjejPorosineMeTeShtrenjte(){


            return null;
        }

        public Order[] getOrders() {
            return orders;
        }

        public Customer[] getCustomers() {
            return customers;
        }

        public String getEmri() {
            return emri;
        }

        public void setEmri(String emri) {
            this.emri = emri;
        }

        public int getNrPunonjesish() {
            return nrPunonjesish;
        }

        public void setNrPunonjesish(int nrPunonjesish) {
            this.nrPunonjesish = nrPunonjesish;
        }
    }


