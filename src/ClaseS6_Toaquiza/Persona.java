package ClaseS6_Toaquiza;

public class Persona {
    public String nombre;
    public int edad;
    public String cedula;
        public Persona(String nombre, int edad, String cedula){
            this.nombre=nombre;
            this.edad=edad;
            this.cedula=cedula;
        }
        public void imprimir () {
            System.out.println("Datos Personales");
            System.out.println("El numero de cedula es: "+cedula);
            System.out.println("El nombre es: "+nombre);
            System.out.println("La edad es: "+edad);
        }
}
    class Estudiante extends Persona {
        public String codigo;
            public Estudiante(String nombre, int edad, String cedula,String codigo) {
                super(nombre,edad,cedula);
                this.codigo=codigo;
            }
            public void imprimirSaludo() {System.out.println("Hola Mundo");}
            @Override
            public void imprimir () {
                super.imprimir();
                System.out.println("El codigo del estudiante: "+codigo);
            }
    }
    class Profesor extends Persona {
        String materia;
        public Profesor (String nombre, int edad, String cedula,String materia) {
            super(nombre,edad,cedula);
            this.materia=materia;
        }
        @Override
        public void imprimir () {
            super.imprimir();
            System.out.println("El codigo del estudiante: "+materia);
        }
    }

