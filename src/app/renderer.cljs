(ns app.renderer)

(def electron (js/require "electron"))

(defn init []
  (js/console.log "Starting Application"))
  ; (js/Notification. "Hello ClojuTRE!" (clj->js {:body "It's great to be here."})))
