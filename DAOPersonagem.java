/**IFPB - Curso SI - Disciplina de PERSISTENCIA DE OBJETOS
 * @author Prof Fausto Ayres
 */

package daojpa;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Personagem;

public class DAOPersonagem extends DAO<Personagem>{
	
	public Personagem read(Object chave){
		try{
			String nome = (String) chave;
			Query q = manager.createQuery("select p from Personagem p where p.nome= '" + nome +"'");
			return (Personagem) q.getSingleResult();
			
		}catch(NoResultException e){
			return null;
		}
	}
}

