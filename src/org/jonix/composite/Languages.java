package org.jonix.composite;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.codelist.LanguageRoles;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class Languages extends JonixComposite<Languages.Language>
{
	private static final long serialVersionUID = 4068906626055213096L;

	public static class Language implements Serializable
	{
		private static final long serialVersionUID = 3499472311000375459L;

		public final LanguageRoles languageRole;
		public final String languageCode;

		public Language(LanguageRoles languageRole, String languageCode)
		{
			this.languageRole = languageRole;
			this.languageCode = languageCode;
		}

		@Override
		public String toString()
		{
			return String.format("Language [%s]: %s", (languageRole == null) ? null : languageRole.name(), languageCode);
		}
	}

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver)
	{
		if (resolver.onixTypeOf(o) == ONIX.Language)
		{
			String languageRoleCode = (String) JonixUtils.getProperty(o, resolver.onixPropOf(ONIX.LanguageRole), "value");
			String languageCode = (String) JonixUtils.getProperty(o, resolver.onixPropOf(ONIX.LanguageCode), "value", "value"); // List74
			add(new Language(LanguageRoles.fromCode(languageRoleCode), languageCode));
			return this;
		}
		
		return null;
	}
}
