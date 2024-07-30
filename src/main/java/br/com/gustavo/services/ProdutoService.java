/**
 * 
 */
package br.com.gustavo.services;

import br.com.gustavo.dao.IProdutoDAO;
import br.com.gustavo.domain.Produto;
import br.com.gustavo.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
