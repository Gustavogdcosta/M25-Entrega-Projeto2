/**
 * 
 */
package br.com.gustavo.dao;

import br.com.gustavo.dao.generic.IGenericDAO;
import br.com.gustavo.domain.Venda;
import br.com.gustavo.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
