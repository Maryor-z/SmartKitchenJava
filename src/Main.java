public class Main {
    public static void main(String[] args) {
        SmarkKitchen kitchen = new SmarkKitchen();

//        kitchen.getDishwasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getDishwasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, true, false);
        kitchen.doKitchenWork();

    }
}
