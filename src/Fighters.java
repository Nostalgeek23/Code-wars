public class Fighters {

//    Create a function that returns the name of the winner in a fight between two fighters.
//
//    Each fighter takes turns attacking the other and whoever kills the other first is victorious.
//    Death is defined as having health <= 0.
//
//    Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
//
//    Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0.
//    You can mutate the Fighter objects.
//
//    Your function also receives a third argument, a string, with the name of the fighter that attacks first.



        public String name;
        public int health, damagePerAttack;
        public Fighters(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }

    public static String declareWinner(Fighters fighter1, Fighters fighter2, String firstAttacker) {
        // Your code goes here. Have fun!

        if (firstAttacker.equals(fighter1.name)) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health < 0) {
                    break;
                }
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health < 0) {
                    break;
                }
            }
        }

        if (firstAttacker.equals(fighter2.name)) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health < 0){
                    break;
                }
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health < 0) {
                    break;
                }
            }
        }

            String winner = null;
            if (fighter1.health <= 0) {
                winner = fighter2.name;
            }
            if (fighter2.health <= 0) {
                winner = fighter1.name;
            }

            return winner;
    }



















}
