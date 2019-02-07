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
  let start;
  
  function writeEmoji(emoji) {
    const emojisInput = $('#solution_content');
    console.log(emoji);
    const emojiCursorStart = emojisInput.prop('selectionStart');
    const emojiCursorEnd = emojisInput.prop('selectionEnd');
    const value = emojisInput.val() || '';
    const textBefore = value.substring(0,  emojiCursorStart);
    const textAfter  = value.substring(emojiCursorEnd, value.length);
    emojisInput.val(textBefore + emoji + textAfter);
    start = emojiCursorStart + emoji.length;
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