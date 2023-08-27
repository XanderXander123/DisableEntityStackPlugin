import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class EntityStack implements Listener {
  
    @EventHandler public void onEntitySpawn
    (EntitySpawnEvent event) { if (event.getEntityType() 
    == EntityType.ZOMBIE) { event.setCancelled(true); 
        }
    }
}
