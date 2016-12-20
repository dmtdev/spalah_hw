package ua.spalah.basics.LogParser;

import java.util.*;

/**
 * Created by root on 20.12.2016.
 */
class Entry
{
    protected Date datetime;
    protected String warnLevel;
    protected String warnMessage;

    public Entry() {
        this.datetime = null;
        this.warnLevel=null;
        this.warnMessage=null;
    }
    public Entry(Date data, String warnLevel, String warnMessage){
        this.datetime=datetime;
        this.warnLevel=warnLevel;
        this.warnMessage=warnMessage;
    }
    public Date getDatetime() {
        return (Date) datetime.clone();
    }
    public String getWarnLevel(){
        return warnLevel;
    }
    public String getWarnMessage(){
        return warnMessage;
    }
    @Override
    public String toString()
    {
        String result = "Date: "+this.datetime.toString()+"\n";
        result += "WarnLevel: " + this.warnLevel+"\n";
        result += "WarnMessage: " + this.warnMessage;
        return result;
    }

    public boolean isNull()
    {
        if (this.datetime==null || this.warnLevel==null || this.warnMessage==null){
            return true;
        }
        else{
            return false;
        }
    }
    // TODO: 20.12.2016 Think about:
    // TODO: 20.12.2016 Add writeToDb ? 
    // TODO: 20.12.2016 Add warnLevelOutput ?
    // TODO: 20.12.2016 Add sendErrorsTo ?
}
