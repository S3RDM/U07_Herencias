package a02;

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
}