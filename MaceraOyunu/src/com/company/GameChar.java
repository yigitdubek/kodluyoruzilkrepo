package com.company;

    public abstract class  GameChar{
        private int id;
        private String name;
        private int damage;
        private int healthy;
        private int cash;

            public GameChar(int id,String name,int damage,int healthy,int cash){
                this.id=id;
                this.name=name;
                this.damage=damage;
                this.healthy=healthy;
                this.cash=cash;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getDamage() {
            return damage;
        }

        public void setDamage(int damage) {
            this.damage = damage;
        }

        public int getHealthy() {
            return healthy;
        }

        public void setHealthy(int healthy) {
            this.healthy = healthy;
        }

        public int getCash() {
            return cash;
        }

        public void setCash(int cash) {
            this.cash = cash;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
