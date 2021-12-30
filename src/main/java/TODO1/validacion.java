package TODO1;

//<editor-fold defaultstate="collapsed" desc="comment">

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;


//</editor-fold>

    public class  validacion  {
        private static boolean btn =false;

    public static boolean isBtn() {
        return btn;
    }

    public static void setBtn(boolean btn) {
        validacion.btn = btn;
    }
        
      
    public void validor (){
      this.setBtn(false);  
    }
    public void validar(String usuarios[], String user, String pwd, int intentos){
    boolean existe;
        existe = false;
    
    for(int i=0;i < usuarios.length;i++){
        if ((usuarios[i].equalsIgnoreCase(user)&& usuarios[i+1].equals(pwd))){
          this.setBtn(true);
    
          } 
        
    }
        }

  
  
}

    
    

