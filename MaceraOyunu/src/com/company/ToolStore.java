package com.company;

public class ToolStore extends NormalLoc{

    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onlocation() {
        System.out.println("-----Mağzaya hoşgeldiniz-----");
        System.out.println("1-Silahlar");
        System.out.println("2-Zırhlar");
        System.out.println("3-Çıkış yap");
        System.out.println("Seçiminiz:");
        int selectCase = input.nextInt();
        while (selectCase<1 || selectCase>3){
            System.out.println("Girilen değer geçersiz tekrar giriniz :");
            selectCase =input.nextInt();
        }
        switch (selectCase){
            case 1 : printWeapon();
                break;
            case 2: printArmor();
            break;
            case 3:
                System.out.println("Bir daha bekleriz");
                return true;
        }


        return true;
    }
    public void printWeapon()
    {
        System.out.println("Silahlar");
        for (Weapon i : Weapon.weapons())
        {
            System.out.println(i.getId()+"-"+i.getName()+"<Para :" + i.getPrice()+", Hasar :" + i.getDamage() + ", Money:"+i.getPrice()+" >");
        }
        buyWeapon();
    }
    public  void buyWeapon(){
        System.out.println("Lütfen bir silah seçiniz : ");
        int selectWeaponID=input.nextInt();
            while (selectWeaponID<1 || selectWeaponID> Weapon.weapons().length)
            {
                System.out.println("Girilen değer geçersiz tekrar giriniz :");
                selectWeaponID =input.nextInt();
            }
        Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
        if (selectedWeapon != null) {
            // Satın Alma gerçekleştirildi!!
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {

                System.out.println("Yeterli paranız bulunmamaktadır. Bakiyeniz :"+ this.getPlayer().getMoney());
            }
            else {
                System.out.println(Weapon.getWeaponObjByID(selectWeaponID).getName()+" silahını satın aldınız.");
                int balance =getPlayer().getMoney()-Weapon.getWeaponObjByID(selectWeaponID).getPrice();
                getPlayer().setMoney(balance);
                System.out.println("Kalan Paranız :"+ getPlayer().getMoney());
                System.out.println("Önceki silahınız:" + this.getPlayer().getInventory().getWeapon());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
            }
        }
    }
    public  void printArmor(){
        System.out.println("Zırhlar");
        System.out.println("Tabanca");
        System.out.println("Kılıç");

    }
}
