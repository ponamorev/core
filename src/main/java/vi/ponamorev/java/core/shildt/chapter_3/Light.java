package vi.ponamorev.java.core.shildt.chapter_3;

// Calculate distance which light will pass,
// by using variables with 'long' type
class Light {
    public static void main(String[] args) {
        int light_speed;
        long days;
        long seconds;
        long distance;

        // approximate speed light, mile per second
        light_speed = 186000;

        days = 1000; // set amount of days

        seconds = days * 24 * 60 * 60; // convert days to seconds

        distance = light_speed * seconds;

        System.out.print(days + " days ");
        System.out.print("is needed for light for passing about ");
        System.out.println(distance + " miles");
    }
}