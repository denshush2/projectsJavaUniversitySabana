package task2;

import javax.swing.JOptionPane;

public class Statistics {
	int n, x;
    float grades[], gradesComplete[], avar, sum=0;
	public Statistics(){
		this.grades = null;
		this.avar= 0;
		this.gradesComplete= null;
		
	}
	
	//Service
	public void listGrades(){
        System.out.print("Grades form less to more:  ");
        for(int i=0;i<n;i++)
        {
            System.out.print(grades[i]+" ");
        }
        System.out.println();
    
    }
	public void Best(){
        System.out.println("The best grade is :"+grades[0]);
    }
	public void Worst(){
        System.out.println("The worst grade :"+grades[n-1]);
    }
	public void NumBest(){
        x=Integer.parseInt(JOptionPane.showInputDialog("how much to you want: "));
        if(x >0 && x<=n)
        {
            System.out.print("here we go :    ");
            for(int i=0 ;i<x;i++)
                 System.out.print(grades[i]+" ");
        }
        else
             JOptionPane.showMessageDialog(null, "Error try later kappa...!!");
         System.out.println();
    }
	public void NumWorst(){
        x=Integer.parseInt(JOptionPane.showInputDialog("How much do you want? "));
        if(x >0 && x<=n)
        {
            System.out.print("here we go:    ");
            for(int i=n-x ;i<n;i++)
                 System.out.print(grades[i]+" ");
        }
        else
             JOptionPane.showMessageDialog(null, "Error Try later...!!");
    }
	public void Avarage(){
        for(int i=0;i<n;i++)
        {
        	sum+=grades[i];
        }
        avar=sum/n;
        System.out.println("Avarege is :"+avar);
    }
	public void deviation(){
        float desvi;
        sum=0;
        for(int i=0 ;i<n;i++)
        {
        	sum=sum+ (float)Math.pow(grades[i]-avar,2);
        }
        sum=sum/(n-1);
        desvi=(float)Math.sqrt(sum);
        System.out.println( "Standard deviation is:"+desvi);
    }
}
