package com.leetcode.algorithm.hard

class LRUCache(capacity: Int) {
  private class DLinkedNode(val key: Int, var value: Int) {
    var pre: DLinkedNode = _
    var post: DLinkedNode = _

    def this() = this(0, 0)
  }

  private var count: Int = 0
  private val header: DLinkedNode = new DLinkedNode()
  private val tail: DLinkedNode = new DLinkedNode()
  header.post = tail
  tail.pre = header
  private var cache: Map[Int, DLinkedNode] = Map()

  def get(key: Int): Int = {
    cache.get(key) match {
      case Some(x) => {
        removeNode(x)
        addNode(x)
        x.value
      }
      case _ => -1
    }
  }

  def put(key: Int, value: Int) {
    cache.get(key) match {
      case Some(x) => {
        x.value = value
        removeNode(x)
        addNode(x)
      }
      case _ => {
        if (this.count == this.capacity) {
          this.cache = this.cache - this.tail.pre.key
          this.removeNode(this.tail.pre)
          this.count -= 1
        }

        val newNode = new DLinkedNode(key, value)
        this.cache = this.cache + ((key, newNode))
        this.addNode(newNode)
        this.count += 1
      }
    }
  }

  private def addNode(node: DLinkedNode): Unit = {
    this.header.post.pre = node
    node.post = this.header.post
    header.post = node
    node.pre = this.header
  }

  private def removeNode(node: DLinkedNode): Unit = {
    node.pre.post = node.post
    node.post.pre = node.pre
  }
}
