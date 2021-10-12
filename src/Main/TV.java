package Main;

import java.util.List;

public class TV {

    private List<String> channels;
    private int index=0;

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public List<String> getChannels() {
        return channels;
    }

    public String getCurrent(){
        return channels.get(index);
    }

    public TV(List<String> channels) {
        this.channels = channels;
    }

    public String channel_up(){
        if(index+1>channels.size())
            throw new IndexOutOfBoundsException("Upper Bound");
        index++;
        return channels.get(index);
    }

    public String channel_down(){
        if(index==0)
            throw new IndexOutOfBoundsException("Lower Bound");
        index--;
        return channels.get(index);
    }
}
