package pokemonDDR;

public enum EficaciasPokemon {

            NO_ES_MUY_EFICAZ("No es muy eficaz ", 0.5),
            NEUTRO("Neutro", 1),
            ES_MUY_EFICAZ("Es muy eficaz ", 2),
            NO_AFECTA("No afecta ", 0),
            DOBLEMENTE_EFICAZ("Doblemente eficaz ", 4),
            DOBLEMENTE_NO_MUY_EFICAZ ("Doblemente no muy eficaz ", 0.25);



            private String mensaje;

            private double eficacia;

            private EficaciasPokemon( String mensaje, double eficacia){
                this.mensaje = mensaje;
                this.eficacia = eficacia;
            }

            public String getMensaje(){
                return mensaje;
            }

            public double getEficacia() {
            return eficacia;
            }
}
