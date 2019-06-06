/**IFPB - Curso SI - Disciplina de PERSISTENCIA DE OBJETOS
 * @author Prof Fausto Ayres
 */

package daojpa;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Item;

public class DAOItem extends DAO<Item>{
	
	public Item read(Object chave){
		try{
			String nome = (String) chave;
			Query q = manager.createQuery("select i from Item i where i.nome= '" + nome +"'");
			return (Item) q.getSingleResult();
			
		}catch(NoResultException e){
			return null;
		}
	}
}

