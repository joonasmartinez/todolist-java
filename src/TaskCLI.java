import java.util.Scanner;

public class TaskCLI {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        int command = -1;
        String name = null;
        Scanner question = new Scanner(System.in);

        while(command != 9){

            if(name == null){
                System.out.println("Antes de iniciarmos, como devo lhe chamar?");
                name = question.nextLine();
            }else{
                System.out.println(name+", qual opção deseja?");
                if(command == -1 || command == 2) {
                    System.out.println("1 - Add / 2- Comandos / 3- Listar Tasks / 4- Update / 5 - Remove 9- Sair");
                }
                try {
                    command = Integer.parseInt(question.nextLine());
                }catch(NumberFormatException error){
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Comando não permitido.");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    command = 2;
                }

                switch (command){
                    case 1:
                        System.out.println(("Você escolheu "+command+" 'add'."));
                        String description = question.nextLine();
                        if(description == ""){
                            System.out.println("Você precisa dar um nome à task.");
                        }else{
                            taskManager.addTask(description);
                        }
                        break;
                    case 2:
                        System.out.println(("Você escolheu "+command+" 'Comandos'."));
                        break;
                    case 3:
                        System.out.println(("Você escolheu "+command+" 'Listar tasks'."));
                        taskManager.listTasks();
                        break;
                    case 4:
                        System.out.println(("Você escolheu "+command+" 'Update'."));
                        System.out.println("Qual task deseja atualizar?");
                        taskManager.updateTask(Integer.parseInt(question.nextLine()));
                        break;
                    case 5:
                        System.out.println(("Você escolheu "+command+" 'Remove'."));
                        System.out.println("Qual task deseja remover?");
                        taskManager.removeTask(Integer.parseInt(question.nextLine()));
                        break;
                    case 9:
                        System.out.println(("Você escolheu "+command+" 'Sair'."));
                        break;
                    default:

                }

            }
        }
    }
}