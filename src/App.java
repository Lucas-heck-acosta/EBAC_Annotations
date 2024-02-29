import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class App {


    public static void main(String args[])
    {

        ClasseComAnotacao classe = new ClasseComAnotacao();
        Class clazz1 = classe.getClass();
        System.out.println(clazz1);


        try {
            Constructor cons = clazz1.getConstructor();
            ClasseComAnotacao classe1 = (ClasseComAnotacao) cons.newInstance();
            System.out.println(cons);
            System.out.println(classe1);

            System.out.println();
            System.out.println(classe1.getClass().getName());
            System.out.println();

            Field[] fields = classe1.getClass().getDeclaredFields();
            for (Field f : fields)
            {
                Class<?> type = f.getType();
                String nome = f.getName();

                System.out.println(type);
                System.out.println(nome);
                System.out.println();

            }

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
