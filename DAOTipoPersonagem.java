/**IFPB - Curso SI - Disciplina de PERSISTENCIA DE OBJETOS
 * @author Prof Fausto Ayres
 */

package daojpa;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.TipoPersonagem;

public class DAOTipoPersonagem extends DAO<TipoPersonagem>{
	
	public TipoPersonagem read(Object chave){
		try{
			String nome = (String) chave;
			Query q = manager.createQuery("select t from TipoPersonagem t where t.nome= '" + nome +"'");
			return (TipoPersonagem) q.getSingleResult();
			
		}catch(NoResultException e){
			return null;
		}
	}
}

