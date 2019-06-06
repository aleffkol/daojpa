/**IFPB - Curso SI - Disciplina de PERSISTENCIA DE OBJETOS
 * @author Prof Fausto Ayres
 */

package daojpa;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Vendedor;

public class DAOVendedor extends DAO<Vendedor>{
	
	public Vendedor read(Object chave){
		try{
			String nome = (String) chave;
			Query q = manager.createQuery("select v from Vendedor v where v.nome= '" + nome +"'");
			return (Vendedor) q.getSingleResult();
			
		}catch(NoResultException e){
			return null;
		}
	}
}

