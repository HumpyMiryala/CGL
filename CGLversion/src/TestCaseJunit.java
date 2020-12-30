import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCaseJunit {
	public int[][] alive= {{1,2},{2,1},{2,2},{3,0}};
	public int[][] alive2= {{1,2},{1,3},{2,1},{3,0},{4,5}};

	@Test
	public void testCaseOne(){
	GameOfLife c =new GameOfLife();	
	String a= c.printBoard(c.createBoard(5,5,alive));
	Assertions.assertEquals(".....\n..*..\n.**..\n*....\n.....\n",a);
	System.out.println("######Test case one is passed######");
    }
	
	@Test 
	public void nextGeneration1(){
	GameOfLife c1 =new GameOfLife();
	NextGeneration d= new NextGeneration();
	String a1= c1.printBoard(d.generateNextGeneration(c1.createBoard(5,5,alive),2));
	Assertions.assertEquals(".....\n.**..\n*....\n.**..\n.....\n",a1);
	System.out.println("######Test case nextGeneration is passed######");
	}
	
	@Test
	public void testCaseTwo(){
	GameOfLife c11 =new GameOfLife();
	String a11= c11.printBoard(c11.createBoard(6,6,alive2));
	Assertions.assertEquals("......\n..**..\n.*....\n*.....\n.....*\n......\n",a11);
	System.out.println("######Test case two is passed######");
	}
	
	@Test
	public void nextGeneration2(){
	GameOfLife c111 =new GameOfLife();
	NextGeneration d= new NextGeneration();
	String a111= c111.printBoard(d.generateNextGeneration(c111.createBoard(6,6,alive2),4));
	Assertions.assertEquals("......\n.**...\n.**...\n......\n......\n......\n",a111);
	System.out.println("######Test case nextGeneration2 is passed######");
	}
	

}
