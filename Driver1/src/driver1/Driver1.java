/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver1;

/**
 *
 * @author dbs_jd
 */
public class Driver1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public interface RADIO {
	
	public void setESTADO(boolean ESTADO);
	
	public boolean getEstado();
	
	public int getAMFM();
	
	public void setAMFM(int Band);
	
	public void Sintonizar(boolean uD);
	
	public void Guardar(int Pos);
	
	public void Memoria(int Pos);
	
	public float getEmisora();
	
    }
    
}
