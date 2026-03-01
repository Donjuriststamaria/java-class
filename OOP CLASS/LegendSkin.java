class LegendSkin {
    private String skinName;
    private int diamondCost;
    
    public LegendSkin(String name, int cost) {
    this.skinName = name;
    this.diamondCost = cost;
}

    public void displayDetails() {
        System.out.println("Skin: " + skinName);
        System.out.println("Cost: " + diamondCost);
    }
}