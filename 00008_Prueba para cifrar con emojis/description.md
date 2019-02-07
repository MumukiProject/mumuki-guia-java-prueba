<div class="btn-group" role="group" aria-label="Emojis">
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('💜️')">💜️</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('💣')">💣</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('🌵')">🌵</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('🎲')">🎲</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('⭐')">⭐</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('👻')">👻</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('🍄')">🍄</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('🖐️')">🖐️</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('👉')">👉</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('🎮')">🎮</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('👌')">👌</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('🔎')">🔎</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('🎵')">🎵</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('🐷')">🐷</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('🌈')">🌈</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('👁️')">👁️</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('⚽')">⚽</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('❓')">❓</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('🤖')">🤖</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('🍉')">🍉</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('🎹')">🎹</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('💡')">💡</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('✈️')">✈️</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('🌎')">🌎</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('👽')">👽</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('⚠️')">⚠️</button>
  <button type="button" class="btn btn-secondary emoji-button" onclick="writeEmoji('🍎')">🍎</button>
</div>


<script>
  function writeEmoji(emoji) {
    var doc = mumuki.page.editors[0].getDoc();
    var cursor = doc.getCursor();
    doc.replaceRange(emoji, cursor);
  }
</script>

<style>
  .emoji-button {
    background-color: #ecf0f1;
    border: 1px solid #dce4ec;
    border-radius: 4px;
  }
  
  .emoji-button:focus {
    outline-color: #0B456D;
  }
</style>

Prueba para cifrar con emojis