class task {
    int l,h,w,v;

    public void set_length(int l) {
        // Add your code here.
        this.l=l;
    }

    public void set_width(int w) {
        // Add your code here.
        this.w=w;
    }

    public void set_height(int h) {
        // Add your code here.
        this.h=h;
    }

    public void volume() {
        
        // Add your code here.
        v=h*l*w;
        System.out.println(v);
        
    }
}