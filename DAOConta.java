/**IFPB - Curso SI - Disciplina de PERSISTENCIA DE OBJETOS
 * @author Prof Fausto Ayres
 */

package daojpa;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Conta;

public class DAOConta extends DAO<Conta>{
	
	public Conta read(Object chave){
		try{
			String nome = (String) chave;
			Query q = manager.createQuery("select c from Conta c where c.nome= '" + nome +"'");
			return (Conta) q.getSingleResult();
			
		}catch(NoResultException e){
			return null;
		}
	}
}

