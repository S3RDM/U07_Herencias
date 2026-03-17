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
<<<<<<< HEAD
    public boolean equals(Object otro){
        HoraExacta otraHora = (HoraExacta) otro;
        return (this.hora == otraHora.hora ? (this.minuto == otraHora.minuto ? (this.segundo == otraHora.segundo ? true : false) : false) : false);
=======
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        HoraExacta otra = (HoraExacta) obj;
        return this.segundo == otra.segundo && this.toString().equals(otra.toString());
>>>>>>> 726319ce03ae1e0a91c09bc8f2330a4965f2033b
    }
}