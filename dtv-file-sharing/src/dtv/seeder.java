/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtv;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vuong
 */
public class seeder implements Serializable{
    private final String ip;
    private final String port;
    private int aliveTime;
    
    seeder(String ip, String port){
        this.ip = ip;
        this.port = port;
        aliveTime = CONSTANT.KEEP_ALIVE_TIME;
    }
    
    public String parseLine(){
        return (ip + ":" + port + "\n");
    }
    
    public void decTime(){
        aliveTime -=1;
    }
}
