
public class Monumento
{
    
    private String Nombre; 
    private String Ubicacion; 
    private String Color;
    private int Año;  // año de creacion

    public Monumento( String Nombre, String Ubicacion, String Color, int Año){
        
        this.Nombre = Nombre;
        this.Ubicacion = Ubicacion;
        this.Color = Color;
        this.Año = Año;
    }

    public String getNombre(){
        
        return Nombre;
    }
    public String getUbicacion(){
    
        return Ubicacion;
    }
    public String getColor(){
        
        return Color;
    }
    public int getAño(){
    
        return Año;
    }
    public void setNombre(String Nombre){
    
        this.Nombre = Nombre;
    }
    public void setUbicacion(String Ubicacion){
    
        this.Ubicacion = Ubicacion;
    }
    public void setColor(String Color){
    
        this.Color = Color;
    }
    public void setAño(int Año){
    
        this.Año = Año;
    }
    
    public String Informe(){
    
        return "El monumento "+Nombre+" que se ubica en "+Ubicacion+" fue creado el año "+Año+" con su distintivo color "+Color+".";
    }
    
    public void Datos(){
        
        System.out.println("Nombre: "+Nombre);
        System.out.println("Ubicacion: "+Ubicacion);
        System.out.println("Color: "+Color);
        System.out.println("Año: "+Año);
    }
}
