/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanager;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rodion
 */
public class TaskLog {
    private ArrayList <TaskNode> TaskList;
    public TaskLog()
    {
        
    }
    public void createTask(String name,String description,Date date)
    {
        TaskNode task=new TaskNode(name,description,date);
        this.TaskList.add(task);
    }
    public void deleteTask(int index)
    {
        this.TaskList.remove(index);
    }
     public void serializeBuilding() throws IOException {
         try{
        FileOutputStream out=  new FileOutputStream("myfile");      
        ObjectOutputStream objectOut = new ObjectOutputStream(out);
        objectOut.writeObject(this);
        out.flush();
         }catch(IOException ioe){
          ioe.printStackTrace();}
    }
}
