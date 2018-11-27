public class Pisica {
    String nume;
    int greutate;
    int varsta;
    
    public static class Builder {
        private Pisica instance = new Pisica();
        
        public Builder setNume(String nume) {
            instance.nume = nume;
            return this;
        }
        
        public Builder setGreutate(int greutate) {
            instance.greutate = greutate;
            return this;
        }
        
        public Builder setVarsta(int varsta) {
            instance.varsta = varsta;
            return this;
        }
        
        public Pisica build() {
            return instance;
        }
    }
}



