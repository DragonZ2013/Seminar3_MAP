package Main;

public class Remote {

    private TV tv;

    public Remote(TV tv) {
        if(tv==null)
            throw new IllegalArgumentException("Remote needs non-null TV argument");
        this.tv = tv;
    }

    public void channel_up(){
        tv.channel_up();
    }

    public void channel_down(){
        tv.channel_down();
    }


}
