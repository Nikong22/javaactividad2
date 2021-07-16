package model;




public class Usuario {

    private String usuario;

    private String curso;
    
    private String comision;
    
    private String descripcion;

    

    public Usuario(){

        

    }



    public Usuario(String usuario, String curso, String comision, String descripcion) {

        this.usuario = usuario;

        this.curso = curso;
        
        this.comision = comision;
        
        this.descripcion = descripcion;

    }



    public String getUsuario() {

        return usuario;

    }



    public void setUsuario(String usuario) {

        this.usuario = usuario;

    }



    public String getCurso() {

        return curso;

    }



    public void setCurso(String curso) {

        this.curso = curso;

    }
        public String getComision() {

        return comision;

    }



    public void setComision(String comision) {

        this.comision = comision;

    }
        public String getDescripcion() {

        return descripcion;

    }



    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;

    }



    @Override

    public String toString() {

        return "Usuario{" + "usuario=" + usuario + ", curso=" + curso + ", comision=" + comision + ", descripcion=" + descripcion + '}';

    }

    

}


