/**
 * 
 */
package com.tvd12.ezyfox.sfs2x.serverhandler;

import com.tvd12.ezyfox.core.constants.ServerEvent;
import com.tvd12.ezyfox.core.content.impl.BaseAppContext;

/**
 * Support to handle buddy remove event
 * 
 * @author tavandung12
 *
 */
public class BuddyRemoveEventHandler extends BuddyEventHandler {

    /**
     * @param context the context
     */
    public BuddyRemoveEventHandler(BaseAppContext context) {
        super(context);
    }

    /* (non-Javadoc)
     * @see com.tvd12.ezyfox.sfs2x.serverhandler.ServerEventHandler#eventName()
     */
    @Override
    public String eventName() {
        return ServerEvent.BUDDY_REMOVE;
    }
}
