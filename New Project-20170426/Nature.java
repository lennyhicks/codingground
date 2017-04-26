public class Nature {
    public class Defender extends Stat {
        @Override
        public void getAttack(){
            return attack * 0.75; // Reduces to 75% easier to read then attack * 1.5
        }
        
        @Override
        public void getDefense(){
            return defense * 1.50; Multiplies the result to 150% of the original
        }
    }
    
        public class Attacker extends Stat {
        @Override
        public void getAttack(){
            return attack * 1.5; // Multiplies the result to 150% of the original
        }
        
        @Override
        public void getDefense(){
            return defense * 0.75; //Reduces to 75% easier to read then defense / 1.5
        }
    }
}