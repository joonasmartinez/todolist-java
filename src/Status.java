public enum Status {
    TODO("A fazer."),
    IN_PROGRESS("Em progresso..."),
    DONE("Feito!");

    private final String value;

    Status(String value){
        this.value= value;
    }

    @Override
    public String toString(){
        return this.value;
    }
}
