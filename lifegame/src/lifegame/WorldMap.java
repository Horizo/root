package lifegame;

import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;  
import javax.swing.Timer;  
  
/** 
 *  
  */  
  
public class WorldMap extends JPanel {  
  
    private static final long serialVersionUID = -336975817478756636L;  
  
    private final int width = 22;  
  
    private final int height = 22;  
  
    private final char WORLD_MAP_NONE = 'N';  
  
    private final char WORLD_MAP_ALIVE = 'A';  
  
    private final char[][] world = {  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A',  
                    'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A',  
                    'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'A', 'A', 'A', 'N', 'A', 'A', 'A', 'N', 'A', 'N', 'N', 'N',  
                    'A', 'A', 'N', 'N', 'N', 'A', 'N', 'A', 'A', 'A', 'A', 'A',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'A',  
                    'N', 'N', 'A', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'A', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'A', 'N',  
                    'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'A', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'A', 'N',  
                    'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'A',  
                    'N', 'N', 'A', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'A', 'A', 'A', 'N', 'N', 'A', 'N', 'N', 'A', 'N', 'N', 'N',  
                    'A', 'A', 'N', 'N', 'N', 'A', 'N', 'A', 'A', 'A', 'A', 'A',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A',  
                    'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A',  
                    'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
  
    };  
  
    private final char[][] world2 = {  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'A', 'A', 'A', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' }  
  
    };  
  
   // private Image none = LifeGameImages.NONE.getImage();  
  // private Image alive = LifeGameImages.ALIVE.getImage();  
  
    /** 
     * 当前细胞下一状态 
     */  
    private char[][] nextStatus = new char[world.length][world[0].length];  
    // 动画帧之间的延时，每秒60帧  
    private final int DELAY_TIME = 1200;
    private char[][] tempStatus = new char[world.length][world[0].length];  
  
    private Timer timer=new Timer(DELAY_TIME, new ActionListener() {  

        @Override  
        public void actionPerformed(ActionEvent e) {  
            changeCellStatus();  
            repaint();  
        }  
    });
    btnLis btnlis=new btnLis();
   
  
    public WorldMap() {
    	this.setLayout(null);
        this.startAnimation();
        JButton startBtn=new JButton("开始");
        JButton stopBtn=new JButton("暂停");
        JButton resetBtn=new JButton("重置");
        startBtn.setBounds(150, 540, 60, 40);
        stopBtn.setBounds(230,540,60,40);
        resetBtn.setBounds(310, 540, 60, 40);
        this.add(startBtn);
        this.add(stopBtn);
        this.add(resetBtn);
        startBtn.addActionListener(this.btnlis);
        stopBtn.addActionListener(this.btnlis);
        resetBtn.addActionListener(this.btnlis);
    }

    class btnLis implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		String s=e.getActionCommand();
    		try
    		{
    			if(s=="开始")
    			{ 
    		        // 开启计时器  
    		        timer.start();  
    			}
    			else if(s=="暂停")
    			{
    				timer.stop();
    			}
    			else if(s=="重置")
    			{
    				for(int i=0;i<world.length;i++)
    					for(int j=0;j<world[0].length;j++)
    					{
    						int temp=(int)(Math.random()*10);
    						if(temp%2==0) //存活
    						{
    							tempStatus[i][j]=WORLD_MAP_ALIVE;
    						}
    						else
    						{
    							tempStatus[i][j]=WORLD_MAP_NONE;
    						}
    					}
    				changeCellStatus();  
    	            repaint();
    				
    			}
    		}catch(Exception e1){}
    	}
    }
  
    /** 
     * 画图形界面 
     *  
     */  
    @Override  
    protected void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        for (int i = 0; i < nextStatus.length; i++) {  
            for (int j = 0; j < nextStatus[i].length; j++) {  
                if (nextStatus[i][j] == WORLD_MAP_ALIVE) {  
                    g.fillRect( j * width, i * height, width, height);  
                   
                } else {  
                	 g.drawRect( j * width, i * height, width, height); 
                }  
            }  
        }  
    }  
  
    /** 
     * 改变细胞状态 
     *  
        */  
    private void changeCellStatus() {  
        for (int row = 0; row < nextStatus.length; row++) {  
            for (int col = 0; col < nextStatus[row].length; col++) {  
  
                switch (neighborsCount(row, col)) {  
                case 0:  
                case 1:  
                case 4:  
                case 5:  
                case 6:  
                case 7:  
                case 8:  
                    nextStatus[row][col] = WORLD_MAP_NONE;  
                    break;  
                case 2:  
                    nextStatus[row][col] = tempStatus[row][col];  
                    break;  
                case 3:  
                    nextStatus[row][col] = WORLD_MAP_ALIVE;  
                    break;  
                }  
            }  
        }  
        copyWorldMap();  
    }  
  
    /** 
     * 获取当前坐标点临近细胞个数 
     *  
         */  
    private int neighborsCount(int row, int col) {  
        int count = 0, r = 0, c = 0;  
  
        for (r = row - 1; r <= row + 1; r++) {  
            for (c = col - 1; c <= col + 1; c++) {  
                if (r < 0 || r >= tempStatus.length || c < 0  
                        || c >= tempStatus[0].length) {  
                    continue;  
                }  
                if (tempStatus[r][c] == WORLD_MAP_ALIVE) {  
                    count++;  
                }  
            }  
        }  
        if (tempStatus[row][col] == WORLD_MAP_ALIVE) {  
            count--;  
        }  
        return count;  
    }  
  
    /** 
     * 开始动画 
     *  
         */  
    private void startAnimation() {  
        for (int row = 0; row < world.length; row++) {  
            for (int col = 0; col < world[0].length; col++) {  
                nextStatus[row][col] = world[row][col];  
                tempStatus[row][col] = world[row][col];  
            }  
        }  
        // 创建计时器  
      /*  timer = new Timer(DELAY_TIME, new ActionListener() {  
  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                changeCellStatus();  
                repaint();  
            }  
        });  
        // 开启计时器  
        timer.start();  */
    }  
  
    /** 
     * 复制地图 
     *  
 
     */  
    private void copyWorldMap() {  
        for (int row = 0; row < nextStatus.length; row++) {  
            for (int col = 0; col < nextStatus[row].length; col++) {  
                tempStatus[row][col] = nextStatus[row][col];  
            }  
        }  
    }  
    public boolean setTestcase0()
    {
    	char[][] expectStatus=new char[world.length][world[0].length];
    	for (int i = 0; i < nextStatus.length; i++)  
            {
    		   for (int j = 0; j < nextStatus[i].length; j++)
    		   {
    			   tempStatus[i][j]=WORLD_MAP_NONE;
    			   expectStatus[i][j]=WORLD_MAP_NONE;
    		   }
            }
    	tempStatus[0][0]=WORLD_MAP_ALIVE;
    	tempStatus[2][0]=WORLD_MAP_ALIVE;
    	tempStatus[2][2]=WORLD_MAP_ALIVE;
    	changeCellStatus();
    	expectStatus[1][1]=WORLD_MAP_ALIVE;
    	boolean target=true;
    	for (int i = 0; i < nextStatus.length; i++) 
    	{
    		for (int j = 0; j < nextStatus[i].length; j++)
    		{
    			if(expectStatus[i][j]!=tempStatus[i][j])
    			{
    				target=false;
    				return target;
    			}
    		}
    	}
    	return target;
    }
    public boolean setTestcase1()
    {
    	char[][] expectStatus=new char[world.length][world[0].length];
    	for (int i = 0; i < nextStatus.length; i++)  
            {
    		   for (int j = 0; j < nextStatus[i].length; j++)
    		   {
    			   tempStatus[i][j]=WORLD_MAP_NONE;
    			   expectStatus[i][j]=WORLD_MAP_NONE;
    		   }
            }
    	tempStatus[0][0]=WORLD_MAP_ALIVE;
    	tempStatus[0][1]=WORLD_MAP_ALIVE;
    	tempStatus[0][2]=WORLD_MAP_ALIVE;
    	tempStatus[1][0]=WORLD_MAP_ALIVE;
    	tempStatus[1][1]=WORLD_MAP_ALIVE;
    	tempStatus[1][2]=WORLD_MAP_ALIVE;
    	tempStatus[2][0]=WORLD_MAP_ALIVE;
    	tempStatus[2][1]=WORLD_MAP_ALIVE;
    	tempStatus[2][2]=WORLD_MAP_ALIVE;
    	changeCellStatus();
    	expectStatus[0][0]=WORLD_MAP_ALIVE;
    	expectStatus[0][2]=WORLD_MAP_ALIVE;
    	expectStatus[1][3]=WORLD_MAP_ALIVE;
    	expectStatus[2][0]=WORLD_MAP_ALIVE;
    	expectStatus[2][2]=WORLD_MAP_ALIVE;
    	expectStatus[3][1]=WORLD_MAP_ALIVE;
    	boolean target=true;
    	for (int i = 0; i < nextStatus.length; i++) 
    	{
    		for (int j = 0; j < nextStatus[i].length; j++)
    		{
    			if(expectStatus[i][j]!=tempStatus[i][j])
    			{
    				target=false;
    				return target;
    			}
    		}
    	}
    	return target;
    }
}  