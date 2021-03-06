package org.jonix.composite;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class Imprints extends JonixComposite<Imprints.Imprint>
{
	private static final long serialVersionUID = 8955865419418948290L;

	public static class Imprint implements Serializable
	{
		private static final long serialVersionUID = 2341040222554615299L;
		
		public String imprintName;

		@Override
		public String toString()
		{
			return String.format("Imprint: %s", imprintName);
		}
	}

	private transient Imprint activeItem;

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver)
	{
		if (resolver.onixTypeOf(o) == ONIX.Imprint)
		{
			add(activeItem = new Imprint());
			return this;
		}

		if (resolver.onixTypeOf(parent) == ONIX.Imprint)
		{
			switch (resolver.onixTypeOf(o))
			{
				case ImprintName:
					activeItem.imprintName = JonixUtils.getValueAsStr(o);
					break;

				default:
					break;
			}
		}
		
		return null;
	}
}