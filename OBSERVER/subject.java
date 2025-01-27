package OBSERVER;

interface subject {
    public void addobserver(Observer observer);
    public void removeobserver(Observer observer);
    public void notifyobserver();
}
