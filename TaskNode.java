/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanager;

import java.util.Date;

/**
 *
 * @author Rodion
 */
public class TaskNode {
    private String TaskName;
    private String TaskDescription;
    private Date TaskDate;
    public TaskNode(String name,String description,Date date)
    {
        TaskName=name;
        TaskDescription=description;
        TaskDate=date;
    }
    public String getTaskName()
    {
        return this.TaskName;
    }
     public String getTaskDescription()
    {
        return this.TaskDescription;
    }
     public Date getTaskDate()
     {
         return this.TaskDate;
     }
     public void setTaskName(String name)
     {
         this.TaskName=name;
     }
     public void setTaskDescription(String description)
     {
         this.TaskDescription=description;
     }
     public void setTaskName(Date date)
     {
         this.TaskDate=date;
     }
}
