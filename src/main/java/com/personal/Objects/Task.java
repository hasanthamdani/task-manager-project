package com.personal.Objects;
import java.util.*;
/*
 * Task is the outline of what a task can be, and must be implemented for specific types
 */

public abstract class Task
{
    private int id;
    private String name;
    private String type;
    private List<Task> subTasks;
    private String description;
    private int status;

    // Fully Parameterized Constructor
    public Task(String name, String type, List<Task> subTasks, String description, int status)
    {
        this.name = name;
        this.type = type;
        this.subTasks = subTasks;
        this.description = description;
        this.status = status;
    }


    // Getters and Setters of Object Fields
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return this.id;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    public String getType()
    {
        return this.type;
    }

    public void setSubTasks(List<Task> taskList)
    {
        subTasks.addAll(taskList);
    }
    public List<Task> getSubTasks()
    {
        return subTasks;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescription()
    {
        return this.description;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }
    public int getStatus()
    {
        return this.status;

        type.h
    }


    public abstract void equals(Task t);
    public abstract int hashCode();
    
}
