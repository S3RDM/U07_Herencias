package a03;

public class HoraExacta extends Hora{
    int segundo;
    
    public HoraExacta(int hora, int minuto, int segundo){
        super(hora, minuto);
        if(segundo >= 0 && segundo <= 59){
            this.segundo = segundo;
        }else{
            this.segundo = 0;
        }
    }
    
    public boolean setSegundo(int num) {
        if(num >= 0 && num <= 59){
            segundo = num;
            return true;
        }
        return false;
    }
    
    @Override
    public void inc(){
        segundo++;
        if (segundo >= 60){
            segundo = 0;
            super.inc();
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + ":" + String.format("%02d", segundo);
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        HoraExacta otra = (HoraExacta) obj;
        return this.segundo == otra.segundo && this.toString().equals(otra.toString());
    }
}