public class Sadovnik {

    public void filter(Plant plant){
        String title = plant.getTitle();
        title = title.replaceAll("[eyuioaEYUIOA]","");
        title = title + " VGTBL";
        plant.setTitle(title);
    }
}