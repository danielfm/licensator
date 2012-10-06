(ns licensator.view.contact
  (use (licensator config)
       (licensator.view layout)))

(defn contact-view
  "Renders the contact page."
  []
  (layout
   :menu :contact
   :title "Contact - Licensator"
   :banner {:img (str *img-prefix* "contact.png")
            :alt "Contact"
            :title [:h2 {:class "-contact-"} "We'd love to hear from you!"]
            :content (list
                      [:p "This is a fairly new app, so weird things can happen despite my best efforts."]
                      [:p "If you found a bug, or want to send me suggestions, critics, or just words of support, please " [:a {:href (str "mailto:" *author-email*)} "drop me an e-mail"] "."])}))
