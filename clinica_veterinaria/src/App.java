import dao.EspecieDao;
import domain.Especie;

public class App {
    public static void main(String[] args) throws Exception {
        Especie cachorro = new Especie("Cachorro");
        EspecieDao especieDao = new EspecieDao();
        especieDao.inserir(cachorro);
        System.out.println(cachorro);
    }
}
