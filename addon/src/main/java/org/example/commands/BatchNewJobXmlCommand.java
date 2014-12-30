package org.example.commands;

import org.jboss.forge.addon.ui.command.AbstractUICommand;
import org.jboss.forge.addon.ui.context.UIBuilder;
import org.jboss.forge.addon.ui.context.UIContext;
import org.jboss.forge.addon.ui.context.UIExecutionContext;
import org.jboss.forge.addon.ui.input.UIInput;
import org.jboss.forge.addon.ui.input.UIInputMany;
import org.jboss.forge.addon.ui.input.UISelectMany;
import org.jboss.forge.addon.ui.input.UISelectOne;
import org.jboss.forge.addon.ui.metadata.UICommandMetadata;
import org.jboss.forge.addon.ui.util.Metadata;
import org.jboss.forge.addon.ui.util.Categories;
import org.jboss.forge.addon.ui.result.Result;
import org.jboss.forge.addon.ui.result.Results;

import javax.inject.Inject;
import java.lang.Override;
import java.lang.Exception;

public class BatchNewJobXmlCommand extends AbstractUICommand
{
@Inject
   UIInput input;
   @Inject
   UIInputMany<String> inputMany;
   @Inject
   UISelectOne<String> selectOne;
   @Inject
   UISelectMany<String> selectMany;
   @Override
   public UICommandMetadata getMetadata(UIContext context)
   {
      return Metadata.forCommand(BatchNewJobXmlCommand.class).name(
            "batch-new-jobxml");
   }

   @Override
   public void initializeUI(UIBuilder builder) throws Exception
   {
   }

   @Override
   public Result execute(UIExecutionContext context) throws Exception
   {
      return Results
            .success("Command 'batch-new-jobxml' successfully executed!");
   }
}