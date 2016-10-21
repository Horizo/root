package lifegame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;  


  
    
/** 
 * 生命游戏 
 *  
 */  
  
public class LifeGame extends JFrame{  
  
      
    private static final long serialVersionUID = -1660060555234651445L;  
  
    LifeGame(){  
        this.setSize(579,630);  
        this.setTitle("生命游戏[LifeGame]DEMO");  
        /*this.setLayout(null);
        WorldMap map=new WorldMap();
        map.setLocation(0, 0);
        this.getContentPane().add(map);*/ 
        WorldMap map=new WorldMap();
        this.add(map);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }  
      
    public static void main(String[] args){  
        LifeGame game = new LifeGame();
       
        game.setVisible(true);  
    }  
  
}
