package method;

public class Mentality {
        private int mental;

        public Mentality(int initiaMental) {
                this.mental = initiaMental;
        }
        public int getMental() {
                return mental;
        }

        public void setMental(int mental) {
                this.mental = mental;
        }

        public void takeDamage(int damage) {
                mental-= damage;
                if (mental < 0) {
                        mental = 0;
                }
        }

        public void heal(int amount) {
                mental += amount;
                if (mental > 100) {
                        mental = 100;
                }
        }

        public boolean isAlive() {
                return mental > 0;
        }

}
